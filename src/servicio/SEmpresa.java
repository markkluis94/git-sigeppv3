package servicio;

import java.util.List;

import interfazdao.IEmpresaDAO;
import interfazdao.ITutorEmpresarialDAO;
import modelo.AreaConocimiento;

import modelo.TutorEmpresarial;
import modelo.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEmpresa  {

	@Autowired
	private IEmpresaDAO empresaDAO;

	public void guardar(Empresa empresa){
		empresaDAO.save(empresa);
	}
	public List<Empresa> buscarEmpresasActivas()
	{
		List<Empresa> empresas;
		empresas = empresaDAO.buscarEmpresasActivas();
		return empresas;
	}
	public Empresa buscarPorNombreEmpresa(String nombre){
		Empresa empresa;
		empresa = empresaDAO.findByNombre(nombre);
		return empresa;	
	}
	
	public Empresa consultar(String rif){
		
		return empresaDAO.findOne(rif);	
	}
	
	public Empresa buscarEmpresa(String rif){
		return empresaDAO.findOne(rif);
	}

}

