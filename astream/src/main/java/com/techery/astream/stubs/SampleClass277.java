package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass277 {

    @Ignore    private SampleClass278 sampleClass;

    public SampleClass277(){
        sampleClass = new SampleClass278();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}