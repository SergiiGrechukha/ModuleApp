package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass30 {

    @Ignore    private SampleClass31 sampleClass;

    public SampleClass30(){
        sampleClass = new SampleClass31();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}