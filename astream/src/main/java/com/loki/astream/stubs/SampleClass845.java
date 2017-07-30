package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass845 {

    @Ignore    private SampleClass846 sampleClass;

    public SampleClass845(){
        sampleClass = new SampleClass846();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}