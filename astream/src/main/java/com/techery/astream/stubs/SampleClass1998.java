package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1998 {

    @Ignore    private SampleClass1999 sampleClass;

    public SampleClass1998(){
        sampleClass = new SampleClass1999();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}