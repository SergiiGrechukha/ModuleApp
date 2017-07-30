package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1456 {

    @Ignore    private SampleClass1457 sampleClass;

    public SampleClass1456(){
        sampleClass = new SampleClass1457();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}