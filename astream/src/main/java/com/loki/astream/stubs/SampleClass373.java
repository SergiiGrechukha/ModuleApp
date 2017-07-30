package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass373 {

    @Ignore    private SampleClass374 sampleClass;

    public SampleClass373(){
        sampleClass = new SampleClass374();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}