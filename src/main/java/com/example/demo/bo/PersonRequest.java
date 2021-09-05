package com.example.demo.bo;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@XmlRootElement
@JsonFormat
public class PersonRequest {

    @JacksonXmlProperty(namespace = "FirstName")
    private String firstName;

    @JacksonXmlProperty(namespace = "Id")
    private int id;

}
