package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass978 {

    @Ignore    private SampleClass979 sampleClass;

    public SampleClass978(){
        sampleClass = new SampleClass979();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}