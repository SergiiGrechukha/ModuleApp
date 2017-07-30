package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1513 {

    @Ignore    private SampleClass1514 sampleClass;

    public SampleClass1513(){
        sampleClass = new SampleClass1514();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}