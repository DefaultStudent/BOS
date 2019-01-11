package com.bos.web.action;

import com.bos.domain.Outstorage;
import com.bos.service.IOutStorageService;
import com.bos.web.action.base.BaseAction;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author Simon
 */
@Controller
@Scope("prototype")
public class OutsotrageAction extends BaseAction<Outstorage> {

    IOutStorageService outStorageService;
}
