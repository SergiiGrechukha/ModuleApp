package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1790 {

    @Ignore    private SampleClass1791 sampleClass;

    public SampleClass1790(){
        sampleClass = new SampleClass1791();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}