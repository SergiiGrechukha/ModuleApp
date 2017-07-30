package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass777 {

    @Ignore    private SampleClass778 sampleClass;

    public SampleClass777(){
        sampleClass = new SampleClass778();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}