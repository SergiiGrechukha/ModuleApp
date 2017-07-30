package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass267 {

    @Ignore    private SampleClass268 sampleClass;

    public SampleClass267(){
        sampleClass = new SampleClass268();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}