package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1993 {

    @Ignore    private SampleClass1994 sampleClass;

    public SampleClass1993(){
        sampleClass = new SampleClass1994();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}