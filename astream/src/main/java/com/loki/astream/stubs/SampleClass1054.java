package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1054 {

    @Ignore    private SampleClass1055 sampleClass;

    public SampleClass1054(){
        sampleClass = new SampleClass1055();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}