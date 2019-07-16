package com.tianlun.sfgpetclinic.services;

import com.tianlun.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
