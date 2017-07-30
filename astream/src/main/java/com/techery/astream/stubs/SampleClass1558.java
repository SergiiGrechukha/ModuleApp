package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1558 {

    @Ignore    private SampleClass1559 sampleClass;

    public SampleClass1558(){
        sampleClass = new SampleClass1559();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}