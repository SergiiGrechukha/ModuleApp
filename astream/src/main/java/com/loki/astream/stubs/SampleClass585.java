package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass585 {

    @Ignore    private SampleClass586 sampleClass;

    public SampleClass585(){
        sampleClass = new SampleClass586();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}