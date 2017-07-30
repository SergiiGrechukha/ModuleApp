package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass827 {

    @Ignore    private SampleClass828 sampleClass;

    public SampleClass827(){
        sampleClass = new SampleClass828();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}