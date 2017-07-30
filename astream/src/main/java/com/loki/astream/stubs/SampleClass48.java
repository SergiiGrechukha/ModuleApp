package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass48 {

    @Ignore    private SampleClass49 sampleClass;

    public SampleClass48(){
        sampleClass = new SampleClass49();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}