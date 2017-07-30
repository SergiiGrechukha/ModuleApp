package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass720 {

    @Ignore    private SampleClass721 sampleClass;

    public SampleClass720(){
        sampleClass = new SampleClass721();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}