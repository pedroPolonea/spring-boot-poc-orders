package com.orders.resources;

import com.orders.map.vo.ProductVO;
import com.orders.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
@Api(
        tags = "products",
        value="/v1"
)
@RestController("products")
@RequestMapping(value = "v1", produces = "application/json")
public class ProductResources {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProduts(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("active")
    public ResponseEntity<?> getAllActiveProduts(){
        return new ResponseEntity<>(productService.findAllActive(), HttpStatus.OK);
    }

    @ApiOperation(
            value = "Get all products.",
            response = ProductVO.class)
    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody ProductVO productVO){
        return new ResponseEntity<>(productService.save(productVO), HttpStatus.OK);
    }

    @ApiOperation(
            value = "Get all products.",
            response = ProductVO.class)
    @PutMapping
    public  ResponseEntity<?> update(@Valid @RequestBody ProductVO productVO) throws Exception {
        return new ResponseEntity<>(productService.update(Optional.ofNullable(productVO)), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws NotFoundException {
        productService.delete(Optional.ofNullable(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
