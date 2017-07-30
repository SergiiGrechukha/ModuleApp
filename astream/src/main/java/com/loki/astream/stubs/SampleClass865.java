package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass865 {

    @Ignore    private SampleClass866 sampleClass;

    public SampleClass865(){
        sampleClass = new SampleClass866();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}