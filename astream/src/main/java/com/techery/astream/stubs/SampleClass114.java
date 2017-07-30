package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass114 {

    @Ignore    private SampleClass115 sampleClass;

    public SampleClass114(){
        sampleClass = new SampleClass115();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}