package az.developia.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import az.developia.shopping.file.StorageService;
import az.developia.shopping.model.ImageBean;

@RestController
@RequestMapping(path="/fileupload")
@CrossOrigin(origins = "*")
public class FileUploadRestController {

	@Autowired
    private StorageService storageService;
	
	
	 @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	 
	 @ResponseStatus(HttpStatus.CREATED)
	 
	 public ImageBean createFile(  @RequestParam(name = "file", required = false) MultipartFile file    ) {
	    	ImageBean bean=new ImageBean();
	        String imageFileName ="fakeimage.png";    
	        if(file==null){
	        	
	        }else{
	        	imageFileName =   storageService.store(file); 
	        }
	        
	        bean.setImage(imageFileName);
	        return bean;


	    }
}
