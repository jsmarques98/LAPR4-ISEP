/*
 * Copyright (c) 2013-2021 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eapli.base.persistence.impl.inmemory;

import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.bootstrapers.BaseBootstrapper;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.base.questionnairemanagement.repositories.QuestionnaireRepository;
import eapli.base.shoppingCartmanagement.repositories.ShoppingCartRepository;
import eapli.base.warehousemanagement.repository.*;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.InMemoryUserRepository;

/**
 *
 * Created by nuno on 20/03/16.
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

    static {
        // only needed because of the in memory persistence
        new BaseBootstrapper().execute();
    }

    @Override
    public UserRepository users(final TransactionalContext tx) {
        return new InMemoryUserRepository();
    }

    @Override
    public UserRepository users() {
        return users(null);
    }

    @Override
    public ClientUserRepository clientUsers(final TransactionalContext tx) {

        return new InMemoryClientUserRepository();
    }

    @Override
    public ClientUserRepository clientUsers() {
        return clientUsers(null);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return signupRequests(null);
    }

    @Override
    public ProductRepository products() {
        return products(null);
    }

    @Override
    public ProductRepository products(TransactionalContext autoTx) {
        return new InMemoryProductRepository();
    }

    @Override
    public CustomerRepository customers() {
        return  customers(null);
    }

    @Override
    public CustomerRepository customers(TransactionalContext autoTx) {
        return  new InMemoryCustomerRepository();
    }

    @Override
    public QuestionnaireRepository questionnaire() {return questionnaire(null);}

    @Override
    public QuestionnaireRepository questionnaire(TransactionalContext autoTx) {return new InMemoryQuestionnaireRepository();}

    @Override
    public CategoryRepository category() {
        return category(null);
    }

    @Override
    public CategoryRepository category(TransactionalContext autoTx) {
        return new InMemoryCategoryRepository();
    }

    @Override
    public AGVDockRepository aGVDock() {
        return aGVDock(null);
    }

    @Override
    public AGVDockRepository aGVDock(TransactionalContext autoTx) {
        return new InMemoryAGVDockRepository();
    }


    @Override
    public CustomerOrderRepository customerOrder() {
        return customerOrder(null);
    }

    @Override
    public CustomerOrderRepository customerOrder(TransactionalContext autoTx) {
        return new InMemoryCustomerOrderRepository();
    }

    @Override
    public ShoppingCartRepository shoppingCart() {
        return shoppingCart(null);
    }

    @Override
    public AnswerQuestionaireRepository answerQuestionaire() {
        return answerQuestionaire(null);
    }

    @Override
    public AnswerQuestionaireRepository answerQuestionaire(TransactionalContext autoTx) {
        return new InMemoryAnswerQuestionaireRepository();
    }

    @Override
    public ShoppingCartRepository shoppingCart(TransactionalContext autoTx) {
        return new InMemoryShoppingCartRepository();
    }


    @Override
    public WarehouseRepository warehouse() {
        return warehouse(null);
    }

    @Override
    public WarehouseRepository warehouse(TransactionalContext autoTx) {
        return new InMemoryWarehouseRepository();
    }

    @Override
    public RowAisleRepository rowAisle() {
        return rowAisle(null);
    }

    @Override
    public RowAisleRepository rowAisle(TransactionalContext autoTx) {
        return new InMemoryRowAisleRepository();
    }

    @Override
    public AisleRepository aisle() {
        return aisle(null);
    }

    @Override
    public AisleRepository aisle(TransactionalContext autoTx) {
        return new InMemoryAisleRepository();
    }

    @Override
    public AGVRepository agvs(){return  agvs(null);}

    @Override
    public AGVRepository agvs(TransactionalContext autoTX){return new InMemoryAGVRepository();}

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext tx) {
        return new InMemorySignupRequestRepository();
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        // in memory does not support transactions...
        return null;
    }

}
