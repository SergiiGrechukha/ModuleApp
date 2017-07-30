package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass197 {

    @Ignore    private SampleClass198 sampleClass;

    public SampleClass197(){
        sampleClass = new SampleClass198();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}