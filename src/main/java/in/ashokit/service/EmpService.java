package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Emp;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;
	
	
	public EmpService(EmpRepo empRepo) {
		this.empRepo=empRepo;
	}
	
	public List<Emp> getByQbe(){
		
		Emp emp=new Emp();
		emp.setEgender("male");
		emp.setEloc("pune");

		Example<Emp> of = Example.of(emp);
		
		List<Emp> findAll = empRepo.findAll(of);
		
		return findAll;
		
	}
	
}
