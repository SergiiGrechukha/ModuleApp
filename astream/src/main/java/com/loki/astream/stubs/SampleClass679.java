package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass679 {

    @Ignore    private SampleClass680 sampleClass;

    public SampleClass679(){
        sampleClass = new SampleClass680();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}