package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1988 {

    @Ignore    private SampleClass1989 sampleClass;

    public SampleClass1988(){
        sampleClass = new SampleClass1989();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}