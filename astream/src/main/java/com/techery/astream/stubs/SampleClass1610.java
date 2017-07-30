package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1610 {

    @Ignore    private SampleClass1611 sampleClass;

    public SampleClass1610(){
        sampleClass = new SampleClass1611();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}