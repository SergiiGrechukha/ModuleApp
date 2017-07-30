package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1000 {

    @Ignore    private SampleClass1001 sampleClass;

    public SampleClass1000(){
        sampleClass = new SampleClass1001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}