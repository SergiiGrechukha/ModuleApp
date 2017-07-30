package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1992 {

    @Ignore    private SampleClass1993 sampleClass;

    public SampleClass1992(){
        sampleClass = new SampleClass1993();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}