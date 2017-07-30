package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass794 {

    @Ignore    private SampleClass795 sampleClass;

    public SampleClass794(){
        sampleClass = new SampleClass795();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}