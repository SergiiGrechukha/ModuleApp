package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1433 {

    @Ignore    private SampleClass1434 sampleClass;

    public SampleClass1433(){
        sampleClass = new SampleClass1434();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}