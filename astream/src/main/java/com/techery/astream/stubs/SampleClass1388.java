package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1388 {

    @Ignore    private SampleClass1389 sampleClass;

    public SampleClass1388(){
        sampleClass = new SampleClass1389();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}