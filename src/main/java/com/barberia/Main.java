package com.barberia;

import com.barberia.model.Cliente;
import com.barberia.repository.ClienteRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClienteRepository clienteRepository = new ClienteRepository();

        // ==========================================
        // 1. INSERTAR CLIENTE
        // ==========================================

        Cliente nuevoCliente = new Cliente(
                "Carlos",
                "Gomez",
                "3001234567",
                "carlos.gomez@gmail.com",
                "123456"
        );

        boolean insertado = clienteRepository.insertar(nuevoCliente);

        System.out.println("=================================");
        System.out.println("1. INSERTAR CLIENTE");
        System.out.println("Resultado: " + (insertado ? "EXITOSO" : "FALLIDO"));
        System.out.println("=================================");


        // ==========================================
        // 2. CONSULTAR CLIENTES
        // ==========================================

        List<Cliente> clientes = clienteRepository.consultarTodos();

        System.out.println();
        System.out.println("=================================");
        System.out.println("2. CONSULTAR CLIENTES");
        System.out.println("=================================");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }


        // ==========================================
        // 3. ACTUALIZAR CLIENTE
        // ==========================================

        if (!clientes.isEmpty()) {

            Cliente clienteActualizar = clientes.get(clientes.size() - 1);

            clienteActualizar.setTelCli("3119876543");

            boolean actualizado =
                    clienteRepository.actualizar(clienteActualizar);

            System.out.println();
            System.out.println("=================================");
            System.out.println("3. ACTUALIZAR CLIENTE");
            System.out.println("Resultado: " +
                    (actualizado ? "EXITOSO" : "FALLIDO"));
            System.out.println("=================================");
        }


        // ==========================================
        // 4. ELIMINAR CLIENTE
        // ==========================================

        if (!clientes.isEmpty()) {

            Cliente clienteEliminar = clientes.get(clientes.size() - 1);

            boolean eliminado =
                    clienteRepository.eliminar(clienteEliminar.getIdCli());

            System.out.println();
            System.out.println("=================================");
            System.out.println("4. ELIMINAR CLIENTE");
            System.out.println("Resultado: " +
                    (eliminado ? "EXITOSO" : "FALLIDO"));
            System.out.println("=================================");
        }
    }
}
