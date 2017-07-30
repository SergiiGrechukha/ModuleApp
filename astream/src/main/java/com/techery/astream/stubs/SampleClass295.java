package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass295 {

    @Ignore    private SampleClass296 sampleClass;

    public SampleClass295(){
        sampleClass = new SampleClass296();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}