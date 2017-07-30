package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass61 {

    @Ignore    private SampleClass62 sampleClass;

    public SampleClass61(){
        sampleClass = new SampleClass62();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}