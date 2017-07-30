package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass558 {

    @Ignore    private SampleClass559 sampleClass;

    public SampleClass558(){
        sampleClass = new SampleClass559();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}