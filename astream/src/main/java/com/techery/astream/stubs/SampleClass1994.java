package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1994 {

    @Ignore    private SampleClass1995 sampleClass;

    public SampleClass1994(){
        sampleClass = new SampleClass1995();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}