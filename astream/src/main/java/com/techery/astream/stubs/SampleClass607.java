package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass607 {

    @Ignore    private SampleClass608 sampleClass;

    public SampleClass607(){
        sampleClass = new SampleClass608();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}