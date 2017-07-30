package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass117 {

    @Ignore    private SampleClass118 sampleClass;

    public SampleClass117(){
        sampleClass = new SampleClass118();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}