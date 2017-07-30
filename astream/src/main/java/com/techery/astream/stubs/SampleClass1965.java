package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1965 {

    @Ignore    private SampleClass1966 sampleClass;

    public SampleClass1965(){
        sampleClass = new SampleClass1966();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}