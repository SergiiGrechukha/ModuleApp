package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1392 {

    @Ignore    private SampleClass1393 sampleClass;

    public SampleClass1392(){
        sampleClass = new SampleClass1393();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}