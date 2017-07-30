package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1981 {

    @Ignore    private SampleClass1982 sampleClass;

    public SampleClass1981(){
        sampleClass = new SampleClass1982();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}