package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass236 {

    @Ignore    private SampleClass237 sampleClass;

    public SampleClass236(){
        sampleClass = new SampleClass237();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}