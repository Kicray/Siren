package com.siren.properties.generator;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
@Data
public class TemplateProperty implements Serializable {
    private static final long serialVersionUID = -3805839284150830703L;
    private String xml;
    private String controller;
    private String entity;
    private String mapper;
    private String service;
    private String serviceImpl;
}
