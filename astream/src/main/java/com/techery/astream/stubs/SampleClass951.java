package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass951 {

    @Ignore    private SampleClass952 sampleClass;

    public SampleClass951(){
        sampleClass = new SampleClass952();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}