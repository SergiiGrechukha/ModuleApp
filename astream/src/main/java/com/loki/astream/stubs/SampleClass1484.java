package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1484 {

    @Ignore    private SampleClass1485 sampleClass;

    public SampleClass1484(){
        sampleClass = new SampleClass1485();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}