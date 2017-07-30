package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass108 {

    @Ignore    private SampleClass109 sampleClass;

    public SampleClass108(){
        sampleClass = new SampleClass109();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}