package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass294 {

    @Ignore    private SampleClass295 sampleClass;

    public SampleClass294(){
        sampleClass = new SampleClass295();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}