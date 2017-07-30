package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass403 {

    @Ignore    private SampleClass404 sampleClass;

    public SampleClass403(){
        sampleClass = new SampleClass404();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}